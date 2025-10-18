package com.kaiostavaress.eletriccarapp.ui.screen


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.kaiostavaress.eletriccarapp.R
import com.kaiostavaress.eletriccarapp.ui.theme.EletricCarAppTheme

@Composable
fun MainScreen() {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(top = 28.dp, start = 16.dp, bottom = 16.dp, end = 16.dp)){
        Text(
            text = stringResource(R.string.title),
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(16.dp))

        Row(
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ){
            Text(
                text = stringResource(R.string.carros),
                fontWeight = FontWeight.Bold
            )
            Text(
                text = stringResource(id = R.string.favoritos),
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Image(
            painter = painterResource(R.drawable.eletric_car),
            contentDescription = "Carro Elétrico",
            modifier = Modifier.fillMaxWidth(0.86f)
                .aspectRatio(335f/109f)

        )

        Column(
            modifier = Modifier.padding(start = 8.dp)
        ){
            InfoRow(label = stringResource(R.string.preco), value = "R$ 300.000,00")
            InfoRow(label = stringResource(id = R.string.bateria), value = "300 kWh")
            InfoRow(label = stringResource(id = R.string.potencia), value = "300 cv")
            InfoRow(label = stringResource(id = R.string.recarga), value = "23 min")
        }

    }
}

@Composable
private fun InfoRow(label: String, value: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = label,
            modifier = Modifier.wrapContentWidth()
        )
        Spacer(modifier = Modifier.width(16.dp))
        Text(
            text = value
        )
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    EletricCarAppTheme{
        MainScreen()
    }
}
