# SpringBoot_and_Prometheus

###Connecting Spring Boot Application with Prometheus

1. First you can pull prometheus from Docker Hub by running following command.

```cmd
docker pull prom/prometheus
```
2. Second you need to run Spring Boot Application ( In my case port is 8888

3. Third you need to run Prometheus with config file by running following command.

```cmd
docker run -d --name=prometheus -p 9090:9090 -v {location-of-prometheus.yml_file}/prometheus.yml:
/etc/prometheus/prometheus.yml prom/prometheus --config.file=/etc/prometheus/prometheus.yml
```
