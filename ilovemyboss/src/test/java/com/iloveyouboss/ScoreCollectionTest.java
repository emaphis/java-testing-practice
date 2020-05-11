/*
 * The I Love You Boss App.
 */
package com.iloveyouboss;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 *
 * @author emaphis
 */
public class ScoreCollectionTest {

    /**
     * Test of add method, of class ScoreCollection.
     */
    @Test
    public void test() {
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
