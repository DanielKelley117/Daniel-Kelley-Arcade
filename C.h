//
// Created by Daniel Kelley on 11/9/2022.
//

#ifndef DANIEL_KELLEY_ARCADE_C_H
#define DANIEL_KELLEY_ARCADE_C_H
#include "Fighter.h"
class C: public Fighter {
public:

    /**Requires: nothing
     * Effects: hit, accuracy
     * Initializes accuracy, hit.damage, and hit.name to the fields below.
     */
    C();

    /**Requires: nothing
     * Effects: accuracy, hp
     * Increases accuracy by 20 and decreases hp by 30
     */
    void special_ability() override;

    const string ATTACK_NAME = "Data erase";

    const int ACCURACY_STAT = 30;

    const int ATTACK_STAT = 90;

};

#endif //DANIEL_KELLEY_ARCADE_C_H
