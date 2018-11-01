package com.example.crmsolutionsproject.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.*;

// Configurando o Websocket Endpoint e o message broker
@Configuration
@EnableWebSocketMessageBroker
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {

    // Registra um wesocket que os clientes vão se conectar
    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        // SockJS() habilita opções fallback para browsers que
        // não suportam wesockets
        registry.addEndpoint("/ws").withSockJS();
    }

    //  Message Broker usado para fazer o route de mensagens
    // de um cliente para o outro
    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        // Menssagens com destino começando com "/app" seram roteadas
        // para métodos message-handiling
        registry.setApplicationDestinationPrefixes("/app");

        // Menssagens com destino começando com "/topic" seram roteadas
        // para um message broker
        registry.enableSimpleBroker("/topic");
    }
}