package com.finuncle.android.expenses

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.finuncle.android.R
import com.finuncle.components.ui.FinuncleAppBar
import com.finuncle.components.ui.FinuncleTextFieldWithIcons

@Composable
fun NewExpenseScreen() {

    NewExpenseContent()
}

@Composable
private fun NewExpenseContent(
    onTextAmountValueChange: (value: String) -> Unit
) {
    Column(modifier = Modifier.fillMaxSize()) {
        FinuncleAppBar(
            modifier = Modifier.fillMaxWidth(),
            content = {
                Row(horizontalArrangement = Arrangement.SpaceBetween) {
                    Text(text = "Add expense")
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            imageVector = Icons.Default.Close, contentDescription = stringResource(
                                R.string.close
                            )
                        )
                    }
                }

            }

        )

        Spacer(modifier = Modifier.size(48.dp))

        FinuncleTextFieldWithIcons(
            textFieldValue = "",
            onTextFieldValueChanged = onTextAmountValueChange,
            keyboardActions =  KeyboardActions(onDone = {

            })
        )


    }
}

@Preview
@Composable
fun NewExpensesScreenPreview() = NewExpenseScreen()