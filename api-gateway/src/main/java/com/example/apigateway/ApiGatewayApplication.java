package com.example.apigateway;
//package com.example.apigateway;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
//
//@SpringBootApplication
//@EnableDiscoveryClient
//public class ApiGatewayApplication {
//
//	public static void main(String[] args) {
//		SpringApplication.run(ApiGatewayApplication.class, args);
//	}
//
//}


 class MySingletonClass {
private static MySingletonClass instance;

private MySingletonClass() {

}
public static MySingletonClass getInstance() {
	if (instance == null) {
		synchronized (MySingletonClass.class) {
			if (instance == null) {
				instance = new MySingletonClass();
			}
		}
	}
	return instance;
}


}
