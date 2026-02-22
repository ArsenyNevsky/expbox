package ru.garage.nevars.expbox;

import org.springframework.kafka.annotation.KafkaListener;

public class QuoteConsumer {

    @KafkaListener(topics = "quote-topic")
    public void consumerQuotes(QuoteDto quote) {

    }
}
