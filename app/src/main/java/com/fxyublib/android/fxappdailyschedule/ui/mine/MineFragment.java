package com.fxyublib.android.fxappdailyschedule.ui.mine;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.fxyublib.android.fxappdailyschedule.R;

public class MineFragment extends Fragment {
    private View.OnClickListener mClickListener;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_main_mine, container, false);

        mClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "MineFragment", Toast.LENGTH_SHORT).show();
            }
        };

        View iv_user_header = root.findViewById(R.id.iv_user_header);
        iv_user_header.setOnClickListener(mClickListener);

        View ly_user_info = root.findViewById(R.id.ly_user_info);
        ly_user_info.setOnClickListener(mClickListener);

        TextView tvItem1 = (TextView)root.findViewById(R.id.rl_order_info).findViewById(R.id.item_mine_fragment_content);
        ImageView ivItem1 = (ImageView)root.findViewById(R.id.rl_order_info).findViewById(R.id.item_mine_fragment_head);
        tvItem1.setText("我的订单");
        ivItem1.setImageResource(R.mipmap.icon_mine_order_item_left);

        TextView tvItem2 = (TextView)root.findViewById(R.id.rl_bill_manager).findViewById(R.id.item_mine_fragment_content);
        ImageView ivItem2 = (ImageView)root.findViewById(R.id.rl_bill_manager).findViewById(R.id.item_mine_fragment_head);
        tvItem2.setText("发票管理");
        ivItem2.setImageResource(R.mipmap.bill_manager);

        TextView tvItem3 = (TextView)root.findViewById(R.id.fragment_main_exchange_discount).findViewById(R.id.item_mine_fragment_content);
        ImageView ivItem3 = (ImageView)root.findViewById(R.id.fragment_main_exchange_discount).findViewById(R.id.item_mine_fragment_head);
        tvItem3.setText("兑换优惠");
        ivItem3.setImageResource(R.mipmap.fragment_mine_exchange_discount_icon);

        TextView tvItem4 = (TextView)root.findViewById(R.id.rl_enterprise).findViewById(R.id.item_mine_fragment_content);
        ImageView ivItem4 = (ImageView)root.findViewById(R.id.rl_enterprise).findViewById(R.id.item_mine_fragment_head);
        tvItem4.setText("企业用户");
        ivItem4.setImageResource(R.mipmap.icon_mine_enterpise_item);

        TextView tvItem5 = (TextView)root.findViewById(R.id.rl_help_feedback).findViewById(R.id.item_mine_fragment_content);
        ImageView ivItem5 = (ImageView)root.findViewById(R.id.rl_help_feedback).findViewById(R.id.item_mine_fragment_head);
        tvItem5.setText("我的客服");
        ivItem5.setImageResource(R.mipmap.help_feedback);

        return root;
    }

}