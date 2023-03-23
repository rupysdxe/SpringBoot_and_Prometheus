# SpringBoot_and_Prometheus

Connecting Spring Boot Application with Prometheus

```cmd
docker run -d --name=prometheus -p 9090:9090 -v {location-of-prometheus.yml_file}/prometheus.yml:/etc/prometheus/prometheus.yml prom/prometheus --config.file=/etc/prometheus/prometheus.yml
```
