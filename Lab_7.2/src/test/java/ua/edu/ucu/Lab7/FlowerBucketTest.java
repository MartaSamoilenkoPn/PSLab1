package ua.edu.ucu.Lab7;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import lab7.item.flower.Flower;
import lab7.item.flower.FlowerColor;
import lab7.item.FlowerBucket;
import lab7.item.FlowerPack;

import java.util.Random;

public class FlowerBucketTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;
    private static final int MAX_LENGTH = 100;

    private FlowerBucket flowerBucket;

    @BeforeEach
    public void init() {
        flowerBucket = new FlowerBucket();
    }

    @Test
    public void testPrice() {
        int length = RANDOM_GENERATOR.nextInt(MAX_LENGTH);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        Flower flower = new Flower(length, FlowerColor.RED, price);
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        flowerBucket.addFlowers(flowerPack);
        Assertions.assertEquals(price * quantity, flowerBucket.price());
    }
}
