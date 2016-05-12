package net.md_5.bungee.module.cmd.auth;

import java.util.UUID;
import net.md_5.bungee.Util;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.connection.ProxiedPlayer;
import net.md_5.bungee.api.plugin.Command;

/**
 * Command to list and switch a player between available servers.
 */
public class CommandAuth extends Command
{

    public CommandAuth()
    {
        super( "auth", "bungeecord.command.auth" );
    }

    @Override
    public void execute(CommandSender sender, String[] args)
    {
        if ( !( sender instanceof ProxiedPlayer ) )
        {
            return;
        }

        if ( args.length == 0 )
        {
            sender.sendMessage( "Client Token is missing" );
        } else if ( args.length == 1 )
        {
            sender.sendMessage( "Access token is missing" );
        } else if ( args.length == 2 )
        {
            sender.sendMessage( "Email is missing" );
        } else
        {
            UUID clientToken = null;
            try
            {
                clientToken = UUID.fromString( args[0] );
            } catch ( IllegalArgumentException illegalArgumentException )
            {
                sender.sendMessage( "Invalid client Token" );
                return;
            }

            UUID accessToken = null;
            try
            {
                accessToken = Util.getUUID( args[1] );
            } catch ( IllegalArgumentException illegalArgumentException )
            {
                sender.sendMessage( "Invalid acess Token" );
                return;
            }

            ProxiedPlayer player = (ProxiedPlayer) sender;
            try {
                player.login( clientToken, accessToken.toString().replace( "-", "" ), args[2] );
                sender.sendMessage( "Sucessful logged in" );
            } catch (Exception ex) {
                sender.sendMessage( "Error authenticating" );
                sender.sendMessage( ex.getMessage() );
            }
        }
    }
}
