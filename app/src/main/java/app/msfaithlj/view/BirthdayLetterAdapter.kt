package app.msfaithlj.view

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.cardview.widget.CardView

import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import app.msfaithlj.HeartAnimationHelper

import app.msfaithlj.R
import app.msfaithlj.constant.Constant
import app.msfaithlj.model.BirthdayLetter
import com.facebook.drawee.view.SimpleDraweeView

interface BirthdayLetterItemClickListener {
    fun onItemClickListener(birthdayLetter: BirthdayLetter)
}

class BirthdayLetterAdapter(
    val itemClickListener: BirthdayLetterItemClickListener
) : ListAdapter<BirthdayLetter, BirthdayLetterAdapter.ViewHolder>(MomentDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_first, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val moment = getItem(position)
        holder.bind(moment)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        init {
            setIsRecyclable(false)
        }

        private val cardView: CardView = itemView.findViewById(R.id.item_first_cardview)
        private val ivViewGroup: LinearLayout = itemView.findViewById(R.id.item_first_iv_vg)
        private val sdv: ImageView = itemView.findViewById(R.id.item_first_sdv)
        private val textView: TextView = itemView.findViewById(R.id.item_first_tv)

        fun bind(birthdayLetter: BirthdayLetter) {
            val color = birthdayLetter.paperBgColor

            sdv.setImageResource(birthdayLetter.imageRes!!)
            ivViewGroup.setBackgroundColor(birthdayLetter.paperBgColor!!)

            textView.text = birthdayLetter.herLetter

            itemView.setOnClickListener {
                itemClickListener.onItemClickListener(birthdayLetter)


                val startX = itemView.x + itemView.width / 2
                val startY = itemView.y + itemView.height / 2
                HeartAnimationHelper(itemView.context).addHeartAnimation(itemView as ViewGroup, startX, startY)
            }
        }

    }

    private class MomentDiffCallback : DiffUtil.ItemCallback<BirthdayLetter>() {
        override fun areItemsTheSame(oldItem: BirthdayLetter, newItem: BirthdayLetter): Boolean {
            return oldItem == newItem
        }

        override fun areContentsTheSame(oldItem: BirthdayLetter, newItem: BirthdayLetter): Boolean {
            return oldItem == newItem
        }
    }
}
