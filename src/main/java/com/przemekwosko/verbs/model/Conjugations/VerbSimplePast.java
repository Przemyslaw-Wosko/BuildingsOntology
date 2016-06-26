package com.przemekwosko.verbs.model.Conjugations;

import com.przemekwosko.verbs.model.VerbConjugation;

import javax.persistence.Entity;

/**
 * Created by kudlaty on 15/06/16.
 */

@Entity
public class VerbSimplePast extends VerbConjugation {

    @Override
    public String tenseName() {
        return "Simple Past";
    }
}