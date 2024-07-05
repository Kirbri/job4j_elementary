package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    public void whenManHeight187ThenCorrectWeight() {
        short heightMan = 187;
        double expectedWeight = 100.05;
        double actualWeight = Fit.calculateWeight(heightMan, true);
        assertThat(actualWeight).isEqualTo(expectedWeight);
    }

    @Test
    public void whenWomanHeight170ThenCorrectWeight() {
        short heightWoman = 170;
        double expectedWeight = 69;
        double actualWeight = Fit.calculateWeight(heightWoman, false);

        assertThat(actualWeight).isEqualTo(expectedWeight);
    }

    @Test
    public void whenNegativeHeightThenZeroWeight() {
        short negativeHeight = -150;
        double manWeight = Fit.calculateWeight(negativeHeight, true);
        double womanWeight = Fit.calculateWeight(negativeHeight, false);

        assertThat(manWeight).isLessThan(0);
        assertThat(womanWeight).isLessThan(0);
    }

    @Test
    public void whenZeroHeightThenZeroWeight() {
        short zeroHeight = 0;
        double manWeight = Fit.calculateWeight(zeroHeight, true);
        double womanWeight = Fit.calculateWeight(zeroHeight, false);

        assertThat(manWeight).isCloseTo(-115.0, within(0.0001));
        assertThat(womanWeight).isCloseTo(-126.5, within(0.0001));
    }
}