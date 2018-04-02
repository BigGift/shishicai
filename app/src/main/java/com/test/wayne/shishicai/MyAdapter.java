package com.test.wayne.shishicai;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by paocai on 2018/3/31.
 */

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private ArrayList<MessageBean> mDataList;

    private  MyItemClickListener mItemClickListener;

    public MyAdapter(ArrayList<MessageBean> dataList) {
        this.mDataList = dataList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.view_rv_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(v,mItemClickListener);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.titleSrg.setText(mDataList.get(position).getTitle());
        //holder.contentSrg.setText(mDataList.get(position).getContent());

    }

    @Override
    public int getItemCount() {
        return mDataList == null ? 0 :mDataList.size() ;
    }

    public static  class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        private MyItemClickListener mListener;

        TextView titleSrg;
        //TextView contentSrg;

        public ViewHolder(View itemView,MyItemClickListener mListener ) {
            super(itemView);
            titleSrg=itemView.findViewById(R.id.title_text);
          //  contentSrg=itemView.findViewById(R.id.content_text);
            this.mListener=mListener;
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {
            if (mListener != null) {
                mListener.onItemClick(v, getPosition());
            }
        }
    }

    /**
     * 创建一个回调接口
     */
    public interface MyItemClickListener {
        void onItemClick(View view, int position);
    }

    /**
     * 在activity里面adapter就是调用的这个方法,将点击事件监听传递过来,并赋值给全局的监听
     *
     * @param myItemClickListener
     */
    public void setItemClickListener(MyItemClickListener myItemClickListener) {
        this.mItemClickListener = myItemClickListener;
    }
}
