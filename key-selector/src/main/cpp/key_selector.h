/*
 * Copyright (C) 2015-2016 The CyanogenMod Project
 * Copyright (C) 2021 LSPosed
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#ifndef __KEYCHECK_H__
#define __KEYCHECK_H__
#include <unordered_set>
#include <unordered_map>

// Constants: pressed keys
#define KEYCHECK_CHECK_VOLUMEDOWN 0x01u
#define KEYCHECK_CHECK_VOLUMEUP 0x02u
#define KEYCHECK_PRESSED_VOLUMEDOWN 41u
#define KEYCHECK_PRESSED_VOLUMEUP 42u

enum class Variant {
    YAHFA = 0x11,
    SandHook = 0x12,
    End = SandHook,
};
const auto AllVariants = { Variant::YAHFA, Variant::SandHook };

Variant& operator++( Variant &c ) {
    using IntType = typename std::underlying_type<Variant>::type;
    c = static_cast<Variant>( static_cast<IntType>(c) + 1 );
    if ( c > Variant::End )
        c = Variant::YAHFA;
    return c;
}

Variant operator++( Variant &c, int ) {
    Variant result = c;
    ++c;
    return result;
}

enum Arch {
    ARM,
    ARM64,
    x86,
    x86_64
};

struct VariantDetail {
    const char* expression;
    std::unordered_set<Arch> supported_arch;
};

#endif // __KEYCHECK_H__