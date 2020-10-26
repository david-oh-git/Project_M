/*
 * MIT License
 *
 * Copyright (c) 22/10/2020 7:42   David Osemwota.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NON INFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package io.audioshinigami.characters_list.detail.di

import dagger.hilt.android.EntryPointAccessors
import io.audioshinigami.characters_list.detail.CharacterDetailFragment
import io.audioshinigami.core.di.CoreComponent
import io.audioshinigami.projectm.di.AppComponent

internal fun inject(fragment: CharacterDetailFragment) =
    DaggerCharacterDetailComponent
        .factory()
        .create(
            appComponent(fragment),
            coreComponent(fragment)
        )
        .inject(fragment)

private fun appComponent(fragment: CharacterDetailFragment): AppComponent =
    EntryPointAccessors.fromApplication(
        fragment.requireActivity().applicationContext,
        AppComponent::class.java
    )

private fun coreComponent(fragment: CharacterDetailFragment): CoreComponent =
    EntryPointAccessors.fromApplication(
        fragment.requireContext().applicationContext,
        CoreComponent::class.java
    )