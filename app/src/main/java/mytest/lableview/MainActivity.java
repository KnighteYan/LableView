package mytest.lableview;

import android.graphics.Color;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  LinearLayout homeLayout;
  LinearLayout alipayLayout;
  LinearLayout chatLayout;
  LinearLayout profileLayout;

  ImageView homeImg;
  ImageView alipayImg;
  ImageView chatImg;
  ImageView profileImg;

  TextView homeText;
  TextView alipayText;
  TextView chatText;
  TextView profileText;

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    replaceFragment(new HomeFragment());

    ViewInit();
    HomeColorChange();

    homeLayout.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        LayoutRefresh();
        HomeColorChange();
        replaceFragment(new HomeFragment());
      }
    });

    alipayLayout.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        LayoutRefresh();
        AlipayColorChange();
        replaceFragment(new AlipayFragment());
      }
    });

    chatLayout.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        LayoutRefresh();
        ChatColorChange();
        replaceFragment(new ChatFragment());
      }
    });

    profileLayout.setOnClickListener(new View.OnClickListener() {
      @Override public void onClick(View v) {
        LayoutRefresh();
        ProfileColorChange();
        replaceFragment(new ProfileFragment());
      }
    });
  }

  private void LayoutRefresh() {
    homeImg.setImageResource(R.drawable.home);
    homeText.setTextColor(Color.parseColor("#888888"));
    alipayImg.setImageResource(R.drawable.alipay);
    alipayText.setTextColor(Color.parseColor("#888888"));
    chatImg.setImageResource(R.drawable.chat);
    chatText.setTextColor(Color.parseColor("#888888"));
    profileImg.setImageResource(R.drawable.profile);
    profileText.setTextColor(Color.parseColor("#888888"));
  }

  private void HomeColorChange() {
    homeImg.setImageResource(R.drawable.home_clicked);
    homeText.setTextColor(Color.parseColor("#0000ff"));
  }

  private void AlipayColorChange() {
    alipayImg.setImageResource(R.drawable.alipay_clicked);
    alipayText.setTextColor(Color.parseColor("#0000ff"));
  }

  private void ChatColorChange() {
    chatImg.setImageResource(R.drawable.chat_clicked);
    chatText.setTextColor(Color.parseColor("#0000ff"));
  }

  private void ProfileColorChange() {
    profileImg.setImageResource(R.drawable.profile_clicked);
    profileText.setTextColor(Color.parseColor("#0000ff"));
  }

  private void ViewInit() {
    LayoutInit();
    ImageInit();
    TextInit();
  }

  private void LayoutInit() {
    homeLayout = findViewById(R.id.home_layout);
    alipayLayout = findViewById(R.id.alipay_layout);
    chatLayout = findViewById(R.id.chat_layout);
    profileLayout = findViewById(R.id.profile_layout);
  }

  private void ImageInit() {
    homeImg = findViewById(R.id.home_img);
    alipayImg = findViewById(R.id.alipay_img);
    chatImg = findViewById(R.id.chat_img);
    profileImg = findViewById(R.id.profile_img);
  }

  private void TextInit() {
    homeText = findViewById(R.id.home_text);
    alipayText = findViewById(R.id.alipay_text);
    chatText = findViewById(R.id.chat_text);
    profileText = findViewById(R.id.profile_text);
  }

  private void replaceFragment(android.support.v4.app.Fragment fragment) {
    FragmentManager fragmentManager = getSupportFragmentManager();
    FragmentTransaction transaction = fragmentManager.beginTransaction();
    transaction.replace(R.id.fragment_layout, fragment);
    transaction.addToBackStack(null);
    transaction.commit();
  }
}
