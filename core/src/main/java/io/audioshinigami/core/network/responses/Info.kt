package io.audioshinigami.core.network.responses

/**
 * Rick and Morty API response representing "info" sub response
 *
 * @param count The length of the response.
 * @param pages The amount of pages.
 * @param next Link to the next page if it exists.
 * @param prev Link to the previous pages if it exists.
 */
data class Info (
    val count: Int,
    val pages: Int,
    val next: String?,
    val prev: String?
)