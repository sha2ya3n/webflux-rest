# webflux-rest
Generating RestFull API (Reactive) with WebFlux

in order to run generate restfull api with web flux with this specefic backend application you have to run mongodb on your machine
mongodb is reactive and not relational database . i use docker container to run mongo like:
command to run mongo on docker:

docker run -d -p 27017:27017 -v [location to persist your data]:/data/db mongo
