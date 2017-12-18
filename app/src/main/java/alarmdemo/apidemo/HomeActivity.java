//package alarmdemo.apidemo;
//
//import android.content.Intent;
//import android.databinding.DataBindingUtil;
//import android.graphics.drawable.Drawable;
//import android.os.AsyncTask;
//import android.os.Build;
//import android.os.Bundle;
//import android.os.Handler;
//import android.os.StrictMode;
//import android.support.v4.app.Fragment;
//import android.support.v4.app.FragmentManager;
//import android.support.v4.app.FragmentTransaction;
//import android.support.v4.view.GravityCompat;
//import android.support.v7.widget.LinearLayoutManager;
//import android.text.TextUtils;
//import android.transition.Fade;
//import android.view.View;
//import android.widget.ImageView;
//import android.widget.RelativeLayout;
//
//import com.nostra13.universalimageloader.core.ImageLoader;
//import com.squareup.picasso.Picasso;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.MalformedURLException;
//import java.net.URL;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Stack;
//
//import butterknife.ButterKnife;
//import butterknife.OnClick;
//import yudiz.divey.adapter.navadapter.NavItemAdapter;
//import yudiz.divey.baseclass.BaseAppCompactActivity;
//import yudiz.divey.databinding.ActivityHomeBinding;
//import yudiz.divey.enums.SearchType;
//import yudiz.divey.fragment.Ticket.TicketListFragment;
//import yudiz.divey.fragment.bankdetail.BankDetailFragment;
//import yudiz.divey.fragment.dashboard.DashboardFragment;
//import yudiz.divey.fragment.home.CommonMyListFragment;
//import yudiz.divey.fragment.more.MoreFragment;
//import yudiz.divey.fragment.notification.NotificationFragment;
//import yudiz.divey.fragment.wallet.WalletFragment;
//import yudiz.divey.interfaces.OnDialogCallBackListener;
//import yudiz.divey.model.CenterListModel;
//import yudiz.divey.model.LiveaboardsListModel;
//import yudiz.divey.model.NavItem;
//import yudiz.divey.model.ResortListModel;
//import yudiz.divey.transition.DetailsTransition;
//import yudiz.divey.utility.MyPreference;
//import yudiz.divey.utility.Utility;
//import yudiz.divey.widget.CustomTextView;
//
//import static yudiz.divey.utility.Utility.AppExitDialog;
//
//
//public class HomeActivity extends BaseAppCompactActivity implements View.OnClickListener, OnDialogCallBackListener {
//
//
//    private ActivityHomeBinding mBinding;
//    private NavItemAdapter navItemAdapter;
//    private List<NavItem> navItems;
//    private Fragment mFragment;
//    private FragmentTransaction ft;
//    private Stack<String> titleStack;
//    private MyPreference mPrefrence;
//    private ImageLoader imageLoader;
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_home);
//        mPrefrence = new MyPreference(HomeActivity.this);
//
//        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
//        StrictMode.setThreadPolicy(policy);
//
////        ImageLoaderConfiguration.Builder config = new ImageLoaderConfiguration.Builder(HomeActivity.this);
////        config.threadPriority(Thread.NORM_PRIORITY - 2);
////        config.denyCacheImageMultipleSizesInMemory();
////        config.diskCacheFileNameGenerator(new Md5FileNameGenerator());
////        config.diskCacheSize(50 * 1024 * 1024); // 50 MiB
////        config.tasksProcessingOrder(QueueProcessingType.LIFO);
////        config.writeDebugLogs(); // Remove for release app
////
////// Initialize ImageLoader with configuration.
////        ImageLoader.getInstance().init(config.build());
////
////        imageLoader = ImageLoader.getInstance();
//
//        ButterKnife.bind(this);
//        setupDrawer();
//        setSupportActionBar(mBinding.toolbar);
//        setUpTmpData();
//    }
//
//    private void setupDrawer() {
//        navItems = new ArrayList<>();
//        titleStack = new Stack<>();
//        String[] name = getResources().getStringArray(R.array.menu_list);
//
//        int[] selectedMenuIcon = getSelectedMenuIcon();
//        for (int i = 0; i < name.length; i++) {
//            navItems.add(new NavItem(name[i], selectedMenuIcon[i]));
//        }
//        navItemAdapter = new NavItemAdapter(this, navItems, this);
//        mBinding.rvNavigationItem.setLayoutManager(new LinearLayoutManager(this));
//        mBinding.rvNavigationItem.setAdapter(navItemAdapter);
//        navItemAdapter.setSelector(0);
//        getSupportFragmentManager().addOnBackStackChangedListener(new android.support.v4.app.FragmentManager.OnBackStackChangedListener() {
//
//
//            @Override
//            public void onBackStackChanged() {
//                setToolbarText(titleStack.peek());
//                if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
//                    mBinding.homeIvDrawerMenu.setImageResource(R.drawable.ic_back_btn_header);
//
//
//                } else {
//                    mBinding.homeIvDrawerMenu.setImageResource(R.drawable.ic_menu);
//
//                }
//            }
//        });
//
//        updateSlider();
//        manageNavigation(0);
//    }
//
//
//    public void updateSlider() {
//        if (!TextUtils.isEmpty(mPrefrence.getStringPrefrence(getResources().getString(R.string.pref_login_profile)))) {
//
//
////            String imageUri = mPrefrence.getStringPrefrence(getResources().getString(R.string.pref_login_profile));
////            imageLoader.loadImage(imageUri, new SimpleImageLoadingListener() {
////                @Override
////                public void onLoadingComplete(String imageUri, View view, Bitmap loadedImage) {
////                    // use the loaded image …
////                    mBinding.homeIvDrawerProfile.setImageBitmap(loadedImage);
////                }
////            });
//            Picasso.with(HomeActivity.this).load(mPrefrence.getStringPrefrence(getResources().getString(R.string.pref_login_profile))).placeholder(R.drawable.ic_profile_img).into(mBinding.homeIvDrawerProfile);
////            new LoadBackground(mPrefrence.getStringPrefrence(getResources().getString(R.string.pref_login_profile)), "androidfigure").execute();
//        }
//
//        if (!TextUtils.isEmpty(mPrefrence.getStringPrefrence(getResources().getString(R.string.pref_login_name)))) {
//            mBinding.homeTvUserName.setText(mPrefrence.getStringPrefrence(getResources().getString(R.string.pref_login_name)));
//        }
//    }
//
//    public void setToolbarText(String toolbarText) {
//        mBinding.tvHeaderTitle.setText(toolbarText);
//    }
//
//    public int[] getSelectedMenuIcon() {
//        int icon[] = new int[9];
//        icon[0] = R.drawable.ic_home;
//        icon[1] = R.drawable.ic_liveaboard_white;
//        icon[2] = R.drawable.ic_resort_white;
//        icon[3] = R.drawable.ic_dive_center_white;
//        icon[4] = R.drawable.ic_notification;
//        icon[5] = R.drawable.ic_wallet;
//        icon[6] = R.drawable.ic_bank_detail;
//        icon[7] = R.drawable.ic_ticket;
////        icon[3] = R.drawable.ic_special_offer;
//        icon[8] = R.drawable.ic_more;
//        return icon;
//    }
//
//
//    @OnClick(R.id.home_profile_rl)
//    public void profileClick() {
//        Utility.navigationIntentWithTransitionEffect(this, ProfileActivity.class, mBinding.homeIvDrawerProfile);
//    }
//
//    @OnClick(R.id.home_ll_logout)
//
//    public void logout() {
//        Intent intent = new Intent(this, StartUpFragmentActivity.class);
//        intent.putExtra("isLogout", true);
//        Utility.navigationIntentWithValue(this, intent);
//        mPrefrence.setBooleanPrefrence(getResources().getString(R.string.pref_is_login), false);
//        finish();
//    }
//
//    public ImageView getMenuSecondItem() {
//        return mBinding.homeIvDrawerSecond;
//    }
//
//    public ImageView getMenuFirstItem() {
//        return mBinding.homeIvDrawerFirst;
//    }
//
////    public android.widget.LinearLayout getDateLayout() {
////        return mBinding.homeLlHeaderDate;
////    }
//
////    public CustomTextView getDateTextLayout() {
////        return mBinding.homeTvHeaderDate;
////    }
//
//    public CustomTextView getMenuFirstTextItem() {
//        return mBinding.homeTvDrawerFirst;
//    }
//
//    public RelativeLayout getLayoutFirstTextItem() {
//        return mBinding.homeRlDrawerFirst;
//    }
//
//    @Override
//    public void onClick(View v) {
//        navItemAdapter.setSelector((Integer) v.getTag());
//        mBinding.mainDrawerLayout.closeDrawer(GravityCompat.START);
//        setDelayClickForDrawer((Integer) v.getTag(), 250);
//    }
//
//    private void setDelayClickForDrawer(final int pos, int time) {
//        new Handler().postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                manageNavigation(pos);
//            }
//        }, time);
//    }
//
//    @OnClick(R.id.home_iv_drawer_menu)
//    public void drawerClick() {
//        if (getSupportFragmentManager().getBackStackEntryCount() > 0) {
//            onBackPressed();
//        } else {
//            if (mBinding.mainDrawerLayout.isDrawerOpen(GravityCompat.START))
//                mBinding.mainDrawerLayout.closeDrawer(GravityCompat.START);
//            else
//                mBinding.mainDrawerLayout.openDrawer(GravityCompat.START);
//        }
//    }
//
//
//    @Override
//    public void replaceFragment(Fragment mFragment, String title) {
//        if (mFragment.isAdded() || titleStack.peek().equals(title))
//            return;
//        try {
//            ft = getSupportFragmentManager().beginTransaction();
//            ft.addToBackStack(mFragment.getClass().getSimpleName());
//            ft.replace(R.id.main_fragment_container, mFragment, mFragment.getClass().getSimpleName());
//            titleStack.push(title);
//            ft.commit();
//
//        } catch (Exception e) {
//        }
//    }
//
//
//    @Override
//    public void addFragment(Fragment mFragment, String title) {
//        if (mFragment.isAdded() || titleStack.peek().equals(title))
//            return;
//        try {
//            ft = getSupportFragmentManager().beginTransaction();
//            ft.addToBackStack(mFragment.getClass().getSimpleName());
//            ft.add(R.id.main_fragment_container, mFragment, mFragment.getClass().getSimpleName());
//            titleStack.push(title);
//            ft.commit();
//
//        } catch (Exception e) {
//        }
//    }
//
//
//    @Override
//    public void replaceSharedFragment(Fragment first, Fragment second, String title, String[] transiton, View... view) {
//        if (second.isAdded() || titleStack.peek().equals(title))
//            return;
//        try {
//            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//
//
//                second.setSharedElementEnterTransition(new DetailsTransition());
//                second.setEnterTransition(new Fade());
//                first.setExitTransition(new Fade());
//                second.setSharedElementReturnTransition(new DetailsTransition());
//                ft = getSupportFragmentManager().beginTransaction();
//
//                ft.replace(R.id.main_fragment_container, second, second.getClass().getSimpleName());
//
//                ft.addToBackStack(second.getClass().getSimpleName());
//                for (int i = 0; i < view.length; i++) {
//                    ft.addSharedElement(view[i], transiton[i]);
//                }
//
//                // Apply the transaction
//                ft.commit();
//
//                titleStack.push(title);
//            } else {
//                replaceFragment(second, title);
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//
//
//    public void setSelected(int pos) {
//        navItemAdapter.setSelector(pos);
//    }
//
//
//    public void manageNavigation(int pos) {
//        String title = "";
//        switch (pos) {
//            case 0:
//                mFragment = new DashboardFragment();
//                title = getString(R.string.home);
//                break;
//
//            case 1:
//                mFragment = new CommonMyListFragment(SearchType.LIVABOARDS);
////                ((CommonMyListFragment) mFragment).setLiveaboards(liveaboardsListModels);
//                title = getString(R.string.my_liveaboards);
//                break;
//            case 2:
//                mFragment = new CommonMyListFragment(SearchType.DIVERESORTS);
////                ((CommonMyListFragment) mFragment).setResorts(resortListModels);
//                title = getString(R.string.my_resorts);
//                break;
//            case 3:
//                mFragment = new CommonMyListFragment(SearchType.DIVECENTER);
////                ((CommonMyListFragment) mFragment).setCenters(centerListDatas);
//                title = getString(R.string.my_dive_centers);
//                break;
//            case 4:
//                mFragment = new NotificationFragment();
//                title = getString(R.string.notification);
//                break;
//            case 5:
//                mFragment = new WalletFragment();
//                title = getString(R.string.wallet);
//                break;
//            case 6:
//                mFragment = new BankDetailFragment();
//                title = getResources().getString(R.string.bank_detail_text);
//                break;
//            case 7:
//                mFragment = new TicketListFragment();
//                title = getString(R.string.tickets_text);
//                break;
//
//            case 8:
//                mFragment = new MoreFragment();
//                title = getString(R.string.more);
//                break;
//        }
//
//        if (!title.equals("") && mFragment != null && (titleStack.empty() || !titleStack.peek().equals(title))) {
//            getSupportFragmentManager().popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
//            titleStack.clear();
//            titleStack.push(title);
//            setToolbarText(title);
//            getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment_container, mFragment, mFragment.getClass().getSimpleName()).commit();
//        }
//    }
//
//
//    @Override
//    public void onBackPressed() {
//        if (mBinding.mainDrawerLayout.isDrawerOpen(GravityCompat.START)) {
//            mBinding.mainDrawerLayout.closeDrawer(GravityCompat.START);
//        } else {
//            if (titleStack.size() > 1) {
//                getSupportFragmentManager().popBackStack();
//                titleStack.pop();
//            } else {
//                AppExitDialog(HomeActivity.this);
////                titleStack.pop();
////                super.onBackPressed();
//            }
//        }
//    }
//
//
//    @Override
//    public void onDialogCallBack(Object object) {
//        navItemAdapter.setSelector(1);
//        manageNavigation(1);
//    }
//
//
//    private List<CenterListModel> centerListDatas;
//    private List<LiveaboardsListModel> liveaboardsListModels;
//    private List<ResortListModel> resortListModels;
//    private List<CenterListModel> centerListDatasTemp;
//    private List<LiveaboardsListModel> liveaboardsListModelsTemp;
//    private List<ResortListModel> resortListModelsTemp;
//
//    private void setUpTmpData() {
//        centerListDatasTemp = new ArrayList<>();
//        liveaboardsListModelsTemp = new ArrayList<>();
//        resortListModelsTemp = new ArrayList<>();
//        CenterListModel.setData();
//        centerListDatas = CenterListModel.getList();
//        LiveaboardsListModel.setData();
//        liveaboardsListModels = LiveaboardsListModel.getList();
//        ResortListModel.setData();
//        resortListModels = ResortListModel.getList();
//    }
//
//    private class LoadBackground extends AsyncTask<String, Void, Drawable> {
//
//        private String imageUrl, imageName;
//
//        public LoadBackground(String url, String file_name) {
//            this.imageUrl = url;
//            this.imageName = file_name;
//        }
//
//        @Override
//        protected void onPreExecute() {
//            super.onPreExecute();
//        }
//
//        @Override
//        protected Drawable doInBackground(String... urls) {
//
//            try {
//                InputStream is = (InputStream) this.fetch(this.imageUrl);
//                Drawable d = Drawable.createFromStream(is, this.imageName);
//                return d;
//            } catch (MalformedURLException e) {
//                e.printStackTrace();
//                return null;
//            } catch (IOException e) {
//                e.printStackTrace();
//                return null;
//            }
//        }
//
//        private Object fetch(String address) throws MalformedURLException, IOException {
//            URL url = new URL(address);
//            Object content = url.getContent();
//            return content;
//        }
//
//        @Override
//        protected void onPostExecute(Drawable result) {
//            super.onPostExecute(result);
//            mBinding.homeProfileRl.setBackgroundDrawable(result);
//        }
//    }
//
//    @Override
//    protected void onResume() {
//        super.onResume();
//        updateSlider();
//    }
//}