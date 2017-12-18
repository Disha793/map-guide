package alarmdemo.apidemo;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;

import alarmdemo.apidemo.databinding.RowRvBinding;
import io.realm.RealmResults;

import static alarmdemo.apidemo.DemoApp.realm;

/**
 * Created by yudizmacmini on 18/12/17.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    private Context context;
    private RealmResults<AlarmDb> realmResultsAlarm;
    private RowRvBinding mBinding;


    public RecyclerAdapter(Context context) {
        this.context = context;
        realmResultsAlarm = realm.where(AlarmDb.class).findAll();
        //findAllSorted("miliSecond", Sort.ASCENDING);

    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        mBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.row_rv, parent, false);
        return new ViewHolder(mBinding, parent);
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, int position) {
        holder.set(position);

    }

    @Override
    public int getItemCount() {
        return realmResultsAlarm.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        private RowRvBinding mBinding;
        private View parent;
        //        CircularImageView mCircularImageView;
//        private MyTextView tvPoint;
//        private ImageView ivDeal;
//        private MyTextView tvTitle;
//        private MyTextView tvDesc;
        private ProgressBar pb;
        private LinearLayout llMain;

        public ViewHolder(RowRvBinding mBinding, View itemView) {
            super(mBinding.getRoot());
            this.mBinding = mBinding;
            this.parent = itemView;
//            initViews();
        }


        private void initViews() {
//            mCircularImageView = (CircularImageView) itemView.findViewById(R.id.row_rv_offers_deal_cover);
//            tvPoint = (MyTextView) itemView.findViewById(R.id.row_rv_offers_deal_point);
//            tvTitle = (MyTextView) itemView.findViewById(R.id.row_offer_deal_tv_title);
//            tvDesc = (MyTextView) itemView.findViewById(R.id.row_offer_deal_tv_desc);
//            ivDeal = (ImageView) itemView.findViewById(R.id.row_rv_offers_deal_iv);
//            pb = (ProgressBar) itemView.findViewById(R.id.row_rv_news_offer_deal_pb_image);
//            llMain = (LinearLayout) itemView.findViewById(R.id.row_rv_offer_deal_ll_main);

        }

        public void set(final int position) {


            mBinding.rowRvTvMain.setText(realmResultsAlarm.get(position).getReminderTitle());
//            if (offerData.get(position).getIsCompleted() == 1) {
//                mCircularImageView.setImageResource(R.drawable.ic_correct);
//                tvPoint.setVisibility(View.INVISIBLE);
//
//            } else {
//                mCircularImageView.setImageResource(R.drawable.bg_rounded_stroke);
//                tvPoint.setVisibility(View.VISIBLE);
//            }
//
////            tvPoint.setText(String.valueOf(position + 40));
////            mCircularImageView.setImageResource(position == 0 ? R.drawable.ic_correct : R.drawable.bg_rounded_stroke);
////            tvPoint.setVisibility(position == 0 ? View.INVISIBLE : View.VISIBLE);
//
//            if (!TextUtils.isEmpty(offerData.get(position).getTitle())) {
//                tvTitle.setVisibility(View.VISIBLE);
//                tvTitle.setText(offerData.get(position).getTitle());
//            } else {
//                tvTitle.setVisibility(View.GONE);
//            }
//
//            if (offerData.get(position).getPoint() != null) {
//                tvPoint.setText(offerData.get(position).getPoint() + "");
//            }
//
//            if (!TextUtils.isEmpty(offerData.get(position).getImage())) {
//                String imageUrl = Api.IMAGE_BASE_URL + offerData.get(position).getImage();
//                GlobalClass.loadImageIntoLoader(imageUrl, ivDeal, pb);
//            }
//
//            if (!TextUtils.isEmpty(offerData.get(position).getDescription())) {
//                tvDesc.setVisibility(View.VISIBLE);
//                tvDesc.setText(offerData.get(position).getDescription());
//            } else {
//                tvDesc.setVisibility(View.GONE);
//            }
//
//            llMain.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View view) {
//                    if (offerData.get(position).getIsCompleted() == 0) {
//                        click.onClick(position, offerData.get(position).getUrl(), offerData.get(position).getId(), offerData.get(position).getPoint());
//                    }
//                }
//            });
        }
    }
}
