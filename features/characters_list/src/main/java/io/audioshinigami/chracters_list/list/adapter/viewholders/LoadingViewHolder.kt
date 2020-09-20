package io.audioshinigami.chracters_list.list.adapter.viewholders

import android.view.LayoutInflater
import io.audioshinigami.chracters_list.databinding.ListItemLoadingBinding
import io.audioshinigami.ui.base.BaseViewHolder

/**
 * View holder for loading state.
 */
class LoadingViewHolder(
    inflater: LayoutInflater
): BaseViewHolder<ListItemLoadingBinding>(
    ListItemLoadingBinding.inflate(inflater)
)