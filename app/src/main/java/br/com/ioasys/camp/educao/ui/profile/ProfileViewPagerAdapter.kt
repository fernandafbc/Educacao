package br.com.ioasys.camp.educao.ui.profile

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class ProfileViewPagerAdapter(supportFragmentManager: FragmentManager) : FragmentStatePagerAdapter(supportFragmentManager){

    private val profileFragmentList = ArrayList<Fragment>()
    private val profileTitleList = ArrayList<String>()

    override fun getItem(position: Int): Fragment {
        return profileFragmentList.get(position)
    }

    override fun getCount(): Int {
        return profileFragmentList.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return profileTitleList[position]
    }

    fun addFragment(fragment: Fragment, title: String){
        profileFragmentList.add(fragment)
        profileTitleList.add(title)
    }

}