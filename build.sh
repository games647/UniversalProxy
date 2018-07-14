#!/usr/bin/env bash

# Initialize Waterfall repository
git submodule update --init

# Build base structure
./applyPatches.sh
pushd UniversalProxy

# Initialize BungeeCord repository
git submodule update --init

# Run Waterfall patches
./applyPatches.sh

# Build UniversalProxy
mvn clean package
popd
