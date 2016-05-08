# Needs a Name

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
  the credentials.

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

X will still track upstream BungeeCord and Waterfall and merge changes as needed.

## Join us

* Feel free to open a PR! We accept contributions.
