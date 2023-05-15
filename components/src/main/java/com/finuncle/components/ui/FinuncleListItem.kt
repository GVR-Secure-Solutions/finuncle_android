package com.finuncle.components.ui

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Delete
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.finuncle.components.R

@Composable
fun FinuncleListItem(
    modifier: Modifier = Modifier,
    title: String,
    subtitle: @Composable (() -> Unit)? = null,
    menuOptions: @Composable (() -> Unit)? = null,
) {
    var menuExpanded by remember {
        mutableStateOf(false)
    }
    Row(
        modifier = modifier
            .height(IntrinsicSize.Max)
            .padding(all = 8.dp)
            .padding(end = 8.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Column(verticalArrangement = Arrangement.SpaceAround) {
            Text(text = title, fontWeight = FontWeight.SemiBold)
            if (subtitle != null) {
                subtitle()
            }
        }

        if (menuOptions != null) {
            Box(modifier = Modifier.padding(2.dp)) {
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = stringResource(R.string.more_options)
                )
            }
        }
    }

    DropdownMenu(
        expanded = menuExpanded,
        onDismissRequest = { menuExpanded = false },
    ) {
        // 6
        DropdownMenuItem(
            content = {
                    Icon(imageVector = Icons.Default.Delete, contentDescription ="Delete" )
            },
            onClick = { /* TODO */ },
        )
        DropdownMenuItem(
            content = {
                Icon(imageVector = Icons.Default.Edit, contentDescription ="Edit" )
            },
            onClick = { /* TODO */ },
        )
    }
}