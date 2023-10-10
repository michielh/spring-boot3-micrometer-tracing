
- run `docker-compose up`
- run DemoApplication
- publish message on http://localhost:15672/#/queues/vhost/some.destination.some-group:
  - header: `b3: ef1aa565e9cb1a65-0246e16b008fb61a-1-223be2ef1ac785a9`
  - payload `{ "name": "test" }`
- verify request headers on http://localhost:1234/__admin/requests (ignore the unmatched stub exception in the logs)