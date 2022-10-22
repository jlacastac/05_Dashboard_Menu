package org.iesch.a05_dashboard_menu.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import org.iesch.a05_dashboard_menu.Models.QuizViewModel;
import org.iesch.a05_dashboard_menu.Models.QuizViewModelSingleton;
import org.iesch.a05_dashboard_menu.R;
import org.iesch.a05_dashboard_menu.databinding.ActivityResultBinding;


/**
 * Represents the result screen.
 *
 */
public class ResultActivity extends AppCompatActivity {

    private ActivityResultBinding binding;

    private Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initialize();
    }

    /**
     * Initialize variables and set everything needed.
     *
     */
    private void initialize () {
        binding = ActivityResultBinding.inflate(getLayoutInflater());
        extras = getIntent().getExtras();

        setContentView(binding.getRoot());

        setComponentsText();
        setListeners();
    }

    /**
     * Set the texts of the result and the button.
     *
     */
    private void setComponentsText() {
        if(extras.get(QuizActivity.END) == null) {

            if (extras.getBoolean(QuizActivity.RESULT)) {
                binding.resultTextView.setText(R.string.win_text);
            } else {
                binding.resultTextView.setText(R.string.defeat_text);
            }
            binding.resultButton.setText(R.string.next_button);

        } else {
            binding.resultTextView.setText(R.string.end_text);
            binding.resultButton.setText(R.string.next_button_end_text);
        }
    }

    /**
     * Set the button listeners
     *
     */
    private void setListeners() {
        binding.resultButton.setOnClickListener(v -> {
            if(getQuizViewModel().getQuestionNumber().getValue() == 3) {
                getQuizViewModel().resetQuestionNumber();
            }

            getQuizViewModel().newQuestion();
            finish();
        });
    }

   /**
    * Get the quiz model.
    * 
    * @return QuizViewModel
    */
    private QuizViewModel getQuizViewModel () {
        return QuizViewModelSingleton.getInstance();
    }
}
