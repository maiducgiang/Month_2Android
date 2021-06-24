package com.example.appmonth2.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appmonth2.Mail
import com.example.appmonth2.R
import com.example.appmonth2.databinding.FragmentAc1Binding
import com.snkz.secondmonth_test.MailAdapter

class Ac1Fragment : Fragment() {
    private lateinit var Binding: FragmentAc1Binding
    private var arrMail: ArrayList<Mail> = ArrayList()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Binding = DataBindingUtil.inflate(inflater, R.layout.fragment_ac1, container, false)
        val view: View = Binding.root

        return view
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Binding = DataBindingUtil.setContentView(, R.layout.fragment_ac1)
        createListMails()

        Binding.revListemailMail.adapter = MailAdapter(arrMail)
        Binding.revListemailMail.layoutManager = LinearLayoutManager(this)

    }

    override fun onStart() {
        super.onStart()

    }
    private fun createListMails() : ArrayList<Mail>{
        arrMail.add(Mail(R.drawable.anh4, "Nguyen Manh Duy", "Deadline ngay mai", "nhau khong", "June 23"))
        arrMail.add(Mail(R.drawable.anh4, "Mai Duc Giang", "nhau khong", "nhau khong", "June 22"))
        arrMail.add(Mail(R.drawable.anh2, "Mai Duc Giang", "nhau khong", "nhau khong", "June 18"))
        arrMail.add(Mail(R.drawable.anh5, "Mai Duc Giang", "nhau khong", "nhau khong`", "June 5"))
        arrMail.add(Mail(R.drawable.anh2, "Mai Duc Giang", "nhau khong", "nhau khong", "June 2"))
        return arrMail
    }
}