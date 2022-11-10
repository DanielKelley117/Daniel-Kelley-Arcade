//
// Created by Daniel Kelley on 11/9/2022.
//
#include "C.h"

C::C() {
    hit.set_name(ATTACK_NAME);
    hit.set_damage(ATTACK_STAT);
    accuracy = ACCURACY_STAT;
}

void C::special_ability() {
    accuracy = accuracy + 20;
    hp = hp - 30;
}
