package uz.mahmudxon.bottomnavigation.ui

import android.content.Context
import android.util.AttributeSet
import androidx.annotation.DrawableRes
import com.google.android.material.bottomnavigation.BottomNavigationView
import uz.mahmudxon.bottomnavigation.util.BottomBadgeConroller

class BadgedBottomNavigationView : BottomNavigationView {
    lateinit var badgeConroller: BottomBadgeConroller

    init {
        badgeConroller = BottomBadgeConroller(context)
        badgeConroller.setupWithBottomNaviagtion(this)
    }

    constructor(context: Context) : super(context)
    constructor(context: Context, attributeSet: AttributeSet) : super(context, attributeSet)
    constructor(context: Context, attributeSet: AttributeSet, defStyleAttr: Int) :
            super(context, attributeSet, defStyleAttr)

    fun showBadge(
        itemId: Int,
        value: String?
    ) {
        badgeConroller.showBadge(itemId, value)
    }

    fun removeBadge(itemId: Int) {
        badgeConroller.removeBadge(itemId)
    }

    fun setBackground(@DrawableRes id: Int) {
        badgeConroller.setBackground(id)
    }
}