package com.su.mediabox.config

import com.su.mediabox.App
import com.su.mediabox.R
import com.su.mediabox.util.Util.getResColor

interface Const {

    object ViewComponent {
        const val HISTORY_INFO_TAG = "history_info_tag"
        const val EPISODE_LIST_TAG = "episode_list_tag"
        const val DEFAULT_PAGE = 1
        const val PLAY_SPEED_TAG = "play_speed_tag"
    }

    object Player {
        val SELECT_ITEM_COLOR = getResColor(R.color.unchanged_main_color_2_skin)
        val UNSELECT_ITEM_COLOR = getResColor(android.R.color.white)
    }

    interface Common {
        companion object {
            const val GITHUB_URL = "https://github.com/RyensX/MediaBox"
            const val GITHUB_NEW_ISSUE_URL = "https://github.com/RyensX/MediaBox/issues/new"
            const val USER_NOTICE_VERSION = 2
        }
    }

    object Plugin {
        const val GITHUB_OFFICIAL_REPOSITORY_PLUGIN_INFO_TEMPLATE =
            "https://raw.githubusercontent.com/RyensX/MediaBoxPluginRepository/gh-pages/data/data.json"
        const val GITHUB_OFFICIAL_REPOSITORY_PAGE_PLUGIN_INFO_TEMPLATE =
            "https://raw.githubusercontent.com/RyensX/MediaBoxPluginRepository/gh-pages/data/data_{page}.json"

        const val PLUGIN_STATE_DOWNLOADABLE = 0
        const val PLUGIN_STATE_UPDATABLE = 70
        const val PLUGIN_STATE_DOWNLOADING = 1
        const val PLUGIN_STATE_OPEN = 100
    }

    interface Setting {
        companion object {
            const val SHOW_PLAY_BOTTOM_BAR = "show_play_bottom_bar"
        }
    }

    interface Database {
        object AppDataBase {
            const val MEDIA_DB_FILE_NAME_TEMPLATE = "media_plugin_data_%s.db"
            const val FAVORITE_MEDIA_TABLE_NAME = "favorite"
            const val HISTORY_MEDIA_TABLE_NAME = "history"
            const val SEARCH_MEDIA_TABLE_NAME = "search"
        }

        object OfflineDataBase {
            const val OFFLINE_DATA_BASE_FILE_NAME = "offline_data.db"
            const val PLAY_RECORD_TABLE_NAME = "playRecord"
        }
    }

    interface DownloadAnime {
        companion object {
            val animeFilePath = App.context.getExternalFilesDir(null).toString() + "/DownloadAnime/"
        }
    }

}