/*
 * The ILoveYouBoss App
 */
package com.iloveyouboss;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

/**
 * Test the ScoreCollection class
 * @author emaph
 */
public class ScoreCollectionTest {


    /**
     * Test of add method, of class ScoreCollection.
     */
    @Test
    public void testAdd() {
        // Arrange
        ScoreCollection collection = new ScoreCollection();
        collection.add(() -> 5);
        collection.add(() -> 7);

        // Act
        int actualResult = collection.arithmeticMean();

        // Assert
        assertThat(actualResult, equalTo(6));
    }

}
