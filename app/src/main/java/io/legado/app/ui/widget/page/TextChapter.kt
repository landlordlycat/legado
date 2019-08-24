package io.legado.app.ui.widget.page

data class TextChapter(
    val position: Int,
    val title: String,
    val pages: List<TextPage>,
    val pageLengths: List<Int>
) {
    fun page(index: Int): TextPage? {
        if (index >= 0 && index < pages.size) {
            return pages[index]
        }
        return null
    }

    fun lastPage(): TextPage? {
        if (pages.isNotEmpty()) {
            return pages[pages.lastIndex]
        }
        return null
    }

    fun lastIndex(): Int {
        return pages.size - 1
    }

    fun isLastIndex(index: Int): Boolean {
        return index == pages.size - 1
    }

    fun pageSize(): Int {
        return pages.size
    }
}

