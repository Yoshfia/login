This service depends on below services and applications to run.
1. Cloud-config
   This provides distributed configurations and has dependency on below softwares.
   1. RabbitMQ - This is required to provide the event based subscription to update about config changes.
2. Discovery-server
   This is registry server where service need to register itself so any client application can
   access this service using this registry service.
3. MongoDB
   This service uses MongoDB as persistence storage which must be available to run the application.