cmake_minimum_required(VERSION 3.15)
project(Daniel-Kelley-Arcade)

set(CMAKE_CXX_STANDARD 17)

add_executable(Arcade main.cpp Automaton.cpp Fighter.cpp CDoubleP.cpp C.cpp Java.cpp Python.cpp Attack.cpp)

add_executable(PRTest Programming_Rumble_Testing.cpp Fighter.cpp CDoubleP.cpp C.cpp Java.cpp Python.cpp Attack.cpp)