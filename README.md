# SpringBoot_and_Prometheus

### Connecting Spring Boot Application with Prometheus

1. First you can pull prometheus from Docker Hub by running following command.

```bash
docker pull prom/prometheus
```
2. Second you need to run Spring Boot Application ( In my case port is 8888

3. Third you need to run Prometheus with config file by running following command.

```cmd
docker run -d --name=prometheus -p 9090:9090 -v {location-of-prometheus.yml_file_directory}/prometheus.yml:
/etc/prometheus/prometheus.yml prom/prometheus --config.file=/etc/prometheus/prometheus.yml
```
##### A. /actuator/prometheus endpoint exposed by Spring Boot Application

<img width="1437" alt="Screenshot 2023-03-23 at 8 05 03 PM" src="https://user-images.githubusercontent.com/83266954/227232901-9ad42629-7e07-4b28-b506-5fffa5b22a95.png">

### B. Spring Boot Up and Running as shown in Prometheus
<img width="1440" alt="Screenshot 2023-03-23 at 8 00 16 PM" src="https://user-images.githubusercontent.com/83266954/227232413-05210eae-566c-4510-a963-ca2983285571.png">
