/*
 * MIT License
 *
 * Copyright (c) 2020 David Osemwota.
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

package io.audioshinigami.characters_list.list

import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

internal class CharactersListViewStateTest {

    lateinit var state: CharactersListViewState

    @Test
    fun setStateAsRefreshing_ShouldBeSettled() {
        state = CharactersListViewState.Refreshing

        assertThat(state.isRefreshing()).isTrue()
        assertThat(state.isAddError()).isFalse()
        assertThat(state.isAddLoading()).isFalse()
        assertThat(state.isEmpty()).isFalse()
        assertThat(state.isNoMoreElements()).isFalse()
        assertThat(state.isError()).isFalse()
        assertThat(state.isLoaded()).isFalse()
        assertThat(state.isLoading()).isFalse()
    }

    @Test
    fun setStateAsAddError_ShouldBeSettled() {
        state = CharactersListViewState.AddError

        assertThat(state.isAddError()).isTrue()
        assertThat(state.isRefreshing()).isFalse()
        assertThat(state.isAddLoading()).isFalse()
        assertThat(state.isEmpty()).isFalse()
        assertThat(state.isNoMoreElements()).isFalse()
        assertThat(state.isError()).isFalse()
        assertThat(state.isLoaded()).isFalse()
        assertThat(state.isLoading()).isFalse()
    }

    @Test
    fun setStateAddLoading_ShouldBeSettled() {
        state = CharactersListViewState.AddLoading

        assertThat(state.isRefreshing()).isFalse()
        assertThat(state.isAddError()).isFalse()
        assertThat(state.isAddLoading()).isTrue()
        assertThat(state.isEmpty()).isFalse()
        assertThat(state.isNoMoreElements()).isFalse()
        assertThat(state.isError()).isFalse()
        assertThat(state.isEmpty()).isFalse()
        assertThat(state.isLoaded()).isFalse()
        assertThat(state.isLoading()).isFalse()
    }

    @Test
    fun setStateAsEmpty_ShouldBeSettled() {
        state = CharactersListViewState.Empty

        assertThat(state.isRefreshing()).isFalse()
        assertThat(state.isAddError()).isFalse()
        assertThat(state.isAddLoading()).isFalse()
        assertThat(state.isEmpty()).isTrue()
        assertThat(state.isNoMoreElements()).isFalse()
        assertThat(state.isError()).isFalse()
        assertThat(state.isLoaded()).isFalse()
        assertThat(state.isLoading()).isFalse()
    }

    @Test
    fun setStateAsNoMoreElements_ShouldBeSettled() {
        state = CharactersListViewState.NoMoreElements

        assertThat(state.isRefreshing()).isFalse()
        assertThat(state.isAddError()).isFalse()
        assertThat(state.isAddLoading()).isFalse()
        assertThat(state.isEmpty()).isFalse()
        assertThat(state.isNoMoreElements()).isTrue()
        assertThat(state.isError()).isFalse()
        assertThat(state.isEmpty()).isFalse()
        assertThat(state.isLoaded()).isFalse()
        assertThat(state.isLoading()).isFalse()
    }

    @Test
    fun setStateAsError_ShouldBeSettled() {
        state = CharactersListViewState.Error

        assertThat(state.isRefreshing()).isFalse()
        assertThat(state.isAddError()).isFalse()
        assertThat(state.isAddLoading()).isFalse()
        assertThat(state.isEmpty()).isFalse()
        assertThat(state.isNoMoreElements()).isFalse()
        assertThat(state.isError()).isTrue()
        assertThat(state.isEmpty()).isFalse()
        assertThat(state.isLoaded()).isFalse()
        assertThat(state.isLoading()).isFalse()
    }

    @Test
    fun setStateAsLoaded_ShouldBeSettled() {
        state = CharactersListViewState.Loaded

        assertThat(state.isRefreshing()).isFalse()
        assertThat(state.isAddError()).isFalse()
        assertThat(state.isAddLoading()).isFalse()
        assertThat(state.isEmpty()).isFalse()
        assertThat(state.isNoMoreElements()).isFalse()
        assertThat(state.isError()).isFalse()
        assertThat(state.isEmpty()).isFalse()
        assertThat(state.isLoaded()).isTrue()
        assertThat(state.isLoading()).isFalse()
    }

    @Test
    fun setStateAsLoading_ShouldBeSettled() {
        state = CharactersListViewState.Loading

        assertThat(state.isRefreshing()).isFalse()
        assertThat(state.isAddError()).isFalse()
        assertThat(state.isAddLoading()).isFalse()
        assertThat(state.isEmpty()).isFalse()
        assertThat(state.isNoMoreElements()).isFalse()
        assertThat(state.isError()).isFalse()
        assertThat(state.isEmpty()).isFalse()
        assertThat(state.isLoaded()).isFalse()
        assertThat(state.isLoading()).isTrue()
    }
}
