package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2To10Then10() {
        int first = 1;
        int second = 2;
        int third = 10;
        int result = Max.max(first, second, third);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax3To2Then3() {
        int first = 3;
        int second = 2;
        int result = Max.max(first, second);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1To2To9To4Then9() {
        int first = 1;
        int second = 2;
        int third = 9;
        int fourth = 4;
        int result = Max.max(first, second, third, fourth);
        int expected = 9;
        assertThat(result).isEqualTo(expected);
    }
}
