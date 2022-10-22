package org.iesch.a05_dashboard_menu.Models;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;

import org.iesch.a05_dashboard_menu.Activities.QuizActivity;

/**
 * Singleton of a QuizViewModel
 *  
 */
public class QuizViewModelSingleton {

    private static QuizViewModel viewModel;

    private static Context context;
    private static ViewModelStoreOwner viewModelStoreOwner;

   /**
    * Build a QuizViewModelSingleton.
    * 
    */
    public QuizViewModelSingleton(QuizActivity activity, ViewModelStoreOwner viewModelStoreOwner) {
        this.context = activity.getApplicationContext();
        this.viewModelStoreOwner = viewModelStoreOwner;
    }

    /**
    * Get the instance of the quiz, if its not created
    * create a new one.
    * 
    * @return QuizViewModel
    */
    public static QuizViewModel getInstance() {
        if (viewModel == null) {
            viewModel = new ViewModelProvider(viewModelStoreOwner,
                            new ViewModelFactory(context)).get(QuizViewModel.class);
        }

        return viewModel;
    }
}
