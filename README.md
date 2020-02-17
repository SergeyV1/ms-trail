# ms-trail
Homeworks for Microservice course

# Features

#### Mongo data repository
#### Shared configuration (String config server)
#### Service discovery (Netflix Eureka)
#### Feign client
#### Routing (Netflix Zuul)


# How to use

### Make MONGO available
 - Install Docker plugin in Idea
 - Install Docker desktop, expose daemon on localhost
 - Register in docker
 - Run docker-compose.yml . It takes mongo image from server
 - In Docker pluging console make sure that mongo is running
### Run services in a sequence: 
Eureka(8086), Config(8085), Pc(8081), Po(8082), Zuul(8080)
### To add product to catalog use:
```curl --request POST \
          --url http://localhost:8080/catalog \
          --header 'content-type: application/json' \
          --data '{
        	"name": "Book",
        	"price": 50
        }' 
``` 
Remember returned Id
### To read created product use: 
```curl --request GET \
          --url http://localhost:8080/catalog/{rememberedId}
``` 
### To order product use:
```curl --request PUT \
     --url http://localhost:8080/catalog/{rememberedId}/order
```

