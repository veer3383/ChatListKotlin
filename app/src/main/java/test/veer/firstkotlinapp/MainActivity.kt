package test.veer.firstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val messageList : ArrayList<Message> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayout.VERTICAL
        chat_list.layoutManager = layoutManager

        val adapter = MessageAdapter(messageList, this)
        chat_list.adapter = adapter

        button_send.setOnClickListener {

            messageList.add(Message(field_message.text.toString()))
            Toast.makeText(this,messageList.toString(),Toast.LENGTH_LONG).show()
            adapter.notifyDataSetChanged()
        }

    }
}