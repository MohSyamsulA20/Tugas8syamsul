package com.syamsul.tugas8syamsul

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*
import org.jetbrains.annotations.Nullable

class MyFriendsFragment : Fragment(){
    lateinit var listTeman: MutableList<MyFriend>

    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(MyFriend("mafin","Laki-Laki",
            "alfinade@gmail.com","+6282233445667","malang"))
        listTeman.add(
            MyFriend("ahmad","Laki-Laki",
                "ahmadfaisalstyh@gmail.com","+62812334455233","madura"))
        listTeman.add(
            MyFriend("fai","Laki-Laki",
                "ahmadfaisalstyh@gmail.com","+6282233445667","madura"))
        listTeman.add(MyFriend("saha","Laki-Laki",
            "ahayh@gmail.com","+628523522456014","palembang"))
        listTeman.add(
            MyFriend("sotoyo","Laki-Laki",
                "sotoy@gmail.com","+6285233469632","josta"))
        listTeman.add(MyFriend("ayas","Laki-Laki",
            "ayass2@gmail.com","+6281232145507","malang"))


    }

    private fun tampilTeman(){
        rv_list.layoutManager= LinearLayoutManager(activity)
        rv_list.adapter=MyFriendAdapter(requireActivity(),listTeman)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }
    private fun initView(){
        simulasiDataTeman()
        tampilTeman()

    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}