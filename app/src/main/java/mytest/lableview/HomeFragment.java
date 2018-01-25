package mytest.lableview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class HomeFragment extends Fragment {

  @Nullable @Override
  public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
      @Nullable Bundle savedInstanceState) {
    View view = null;
    if (view == null) {
      view = inflater.inflate(R.layout.alipay_layout, container, false);    //初始化
    } else {
      //事件响应
    }
    return view;
  }
}
