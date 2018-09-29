package test.veer.firstkotlinapp

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_message.view.*

class MessageAdapter (val items : ArrayList<Message>, val context : Context) : RecyclerView.Adapter<MessageAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MessageAdapter.ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.activity_message, parent, false))
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: MessageAdapter.ViewHolder, position: Int) {
        val msg = items[position]
        holder.setData(msg)
    }
    inner class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {

        fun setData(msg: Message) {
            Log.v("MESSAGE", msg.toString())
            itemView.message_view.text = msg.chatMessage
        }
    }
}