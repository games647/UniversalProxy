# UniversalProxy

## Description

This is a BungeeCord/Waterfall fork for a universal revers proxy for the game
Minecraft. BungeeCord requires the backend server to be in offline mode. This
is a requirement because BungeeCord intercepts the packets and the Minecraft
client encrypt the connection after a successful authentication with Mojang.

But this project can make connections to backend online mode servers too. By
making an authentication on the proxy instead of on the client side, we can
connect to online mode servers too. This allows us to make a connection to all
available Minecraft servers on the globe. (^^)

So we can easily switch between servers with just an additional command.

This project is similar to mcleaks.net.

## Features

* All the features BungeeCord and Waterfall also has
* Connection to a online mode backend server (can be BungeeCord too)
* Cracked and Paid Minecraft users can connect to this proxy (configurable)
* You can give your cracked users paid user accounts without giving them
  the credentials.

## Use cases

1. Make connections to all servers on the globe
    * Even online mode servers works
    * Even additional BungeeCord servers works
2. Give cracked users Paid user accounts without giving them
  the credentials. So you can cracked players can player on Minecraft servers
  where paid authentication is required.

  => Cracked player can players can play on servers like mineplex, gomme
  , cubecraft
3. Make shareable accounts

## How to setup

* Build the complete with Maven "mvn clean install"
* Go into "PROJECT/bootstrap/" and copy the waterfall.jar file
* Start a new server using this file
* Now go into "PROJECT/module/" copy the files from
"/cmd-auth/target/cmd_auth.jar" and "/cmd-server/target/cmd_server.jar"
into the "/modules/" folder of the server
* Now restart the server
* You can now test it ingame using the following commands
```/auth clientToken accessToken email```
and then /server IP/Domain

Client token, accessToken and the email can be extracted from the
launcher_profiles.json file (in your .minecraft folder)

Warning: The server will invalidate the current accesToken and will receive
a new one. Then you cannot auto login in your launcher after you restarted it.

You could work-around this by backing up your launcher profile file and generate
a new clientToken with accessToken (delete the file and login once). Then you
can still can auto login.

## Testserver



## Limitation

#### IP-Bans

The connection is established through this proxy. This lets the backend server
only see the proxy IP. So the backend server could make a ip-ban and all
connections through this proxy will drop.

#### Authentication

The minecraft authentication is made by this proxy. Therefore the server has
to know the account credentials.

## Want to try it out?

This project is in early state, but you could already try it out. Just go to the
SeverConnector.java file and edit the email and password. Next build this
project. The final jar is placed in the bootstrap/target folder.

Now you can start working on it like a normal BungeeCord/Waterfall
server.

## Why fork Waterfall?

This project goes out of scope of BungeeCord or Waterfall, so it will be never
merged into the orginal projects.

UniversalProxy will still track upstream BungeeCord and Waterfall and merge
changes as needed.

## Join us

* Feel free to open a PR! We accept contributions.
