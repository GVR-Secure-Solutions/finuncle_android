package com.finuncle.components.ui

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.finuncle.components.ui.theme.FinuncleTheme

@Composable
fun FinuncleTextFieldWithIcons(
    textFieldValue: String,
    onTextFieldValueChanged: (String) -> Unit,
    modifier: Modifier = Modifier,
    placeholder: @Composable (() -> Unit)? = null,
    isError: Boolean = false,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    leadingIcon: @Composable (() -> Unit)? = null,
    trailingIcon: @Composable (() -> Unit)? = null,
    maxLines: Int = 1
) {
    OutlinedTextField(
        modifier = modifier
            .height(52.dp),
        value = textFieldValue,
        onValueChange = {
            onTextFieldValueChanged(it)
        },
        textStyle = FinuncleTheme.typography.bodyRegular,
        placeholder = placeholder,
        singleLine = true,
        keyboardOptions = keyboardOptions,
        keyboardActions = keyboardActions,
        leadingIcon = leadingIcon,
        isError = isError,
        trailingIcon = trailingIcon,
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = FinuncleTheme.color.primaryCharcoal500,
            cursorColor = FinuncleTheme.color.primaryCharcoal500,
            backgroundColor = if (isError) FinuncleTheme.color.semanticCritical100 else FinuncleTheme.color.primaryPureWhite,
            focusedBorderColor = FinuncleTheme.color.primaryCharcoal500,
            unfocusedBorderColor = FinuncleTheme.color.primaryCharcoal10,
            errorBorderColor = FinuncleTheme.color.semanticCritical500
        ),
        shape = RoundedCornerShape(4.dp),
        maxLines = maxLines
    )
}
