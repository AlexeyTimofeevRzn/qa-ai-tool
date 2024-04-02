package ru.timofeev.aitestgeneration.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GigachatConfig {

    @Value("gigachat.client.id")
    public String GIGACHAT_CLIENT_ID;

    @Value("gigachat.client.scope")
    public String GIGACHAT_API_SCOPE;

    @Value("gigachat.client.secret")
    public String GIGACHAT_CLIENT_SECRET;

}
