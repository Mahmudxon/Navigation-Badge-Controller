package uz.mahmudxon.bottomnavigation.util

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import androidx.annotation.DrawableRes
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import uz.mahmudxon.bottomnavigation.R


class BottomBadgeConroller(val context: Context?) {

    var navigation: BottomNavigationView? = null
    var textView: TextView? = null

    fun setupWithBottomNaviagtion(navigation: BottomNavigationView) {
        this.navigation = navigation
    }

    fun showBadge(
        itemId: Int,
        value: String?
    ) {
        if (navigation == null) return
        removeBadge(itemId)
        val itemView: BottomNavigationItemView = navigation!!.findViewById(itemId)
        val badge: View = LayoutInflater.from(context)
            .inflate(R.layout.layout_news_badge, navigation, false)
        if (textView == null)
            textView = badge.findViewById(R.id.badge_text_view)
        textView?.text = value
        itemView.addView(badge)
    }

    fun setBackground(@DrawableRes id: Int) {
        textView?.setBackgroundResource(id)
    }

    fun removeBadge(itemId: Int) {
        if (navigation == null) return
        val itemView: BottomNavigationItemView = navigation!!.findViewById(itemId)
        if (itemView.childCount == 3) {
            itemView.removeViewAt(2)
        }
    }
}