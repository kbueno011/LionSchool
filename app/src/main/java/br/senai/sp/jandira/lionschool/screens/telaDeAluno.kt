package br.senai.sp.jandira.lionschool.screens



import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.lionschool.R

@Composable

fun TelaAluno(){
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        contentAlignment = Alignment.BottomCenter
    ){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(25.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(10.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ){
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = stringResource(R.string.lion_School),
                        modifier = Modifier
                            .width(45.dp)
                            .height(56.dp)
                            .padding(vertical = 5.dp)
                    )
                    Text(
                        text = stringResource(R.string.lion_School),
                        fontSize = 15.sp,
                        color = colorResource(R.color.cor_logo),
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily.Default,
                        modifier = Modifier
                            .width(50.dp)
                            .padding(bottom = 10.dp)
                    )
                }
                Card(
                    modifier = Modifier
                        .width(52.dp)
                        .height(52.dp),
                    shape = RoundedCornerShape(50.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = colorResource(R.color.dark_yellow)
                    )
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ){
                        Text(
                            text = stringResource(R.string.ds),
                            fontSize = 20.sp,
                            fontWeight = FontWeight.Bold,
                            color = colorResource(R.color.cor_logo),
                        )
                    }
                }
            }
            Card(
                modifier = Modifier
                    .height(1.dp)
                    .fillMaxWidth(),
                colors = CardDefaults.cardColors(
                    containerColor = colorResource(R.color.dark_yellow)
                )
            ) {}
            OutlinedTextField(
                value = "",
                onValueChange = {},
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                shape = RoundedCornerShape(12.dp),
                label = { Text(text = stringResource(R.string.find_course)) },
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "",
                        tint = colorResource(R.color.Light_gray)
                    )
                },
                colors = OutlinedTextFieldDefaults.colors(
                    unfocusedBorderColor = colorResource(R.color.dark_yellow),
                    unfocusedContainerColor = colorResource(R.color.gray)
                )
            )
            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 5.dp, top = 13.dp, bottom = 13.dp)
            ){
                Button(
                    onClick = {},
                    modifier = Modifier
                        .padding(end = 10.dp)
                        .height(33.dp)
                        .width(78.dp)

                        ,
                    shape = RoundedCornerShape(15.dp),
                    colors = ButtonDefaults.buttonColors(
                        colorResource(R.color.dark_blue)
                    )
                ) {
                    Text(
                        text = stringResource(R.string.todos),
                        color = colorResource(R.color.white),
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.3.sp
                    )
                }
                Button(
                    onClick = {},
                    modifier = Modifier
                        .padding(end = 10.dp)
                        .height(33.dp)
                        .width(107.dp)

                    ,
                    shape = RoundedCornerShape(15.dp),
                    colors = ButtonDefaults.buttonColors(
                        colorResource(R.color.dark_yellow)
                    )
                ) {
                    Text(
                        text = stringResource(R.string.cursando),
                        color = colorResource(R.color.dark_blue),
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.3.sp
                    )
                }
                Button(
                    onClick = {},
                    modifier = Modifier
                        .height(33.dp)
                        .width(110.dp)

                    ,
                    shape = RoundedCornerShape(15.dp),
                    colors = ButtonDefaults.buttonColors(
                        colorResource(R.color.dark_yellow)
                    )
                ) {
                    Text(
                        text = stringResource(R.string.finalizado),
                        color = colorResource(R.color.dark_blue),
                        fontWeight = FontWeight.Bold,
                        fontSize = 13.3.sp
                    )
                }

            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(5.dp),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = R.drawable.graduation_hat),
                    contentDescription = "",
                    modifier = Modifier
                        .width(32.dp)
                        .height(32.dp)
                )
                Text(
                    text = stringResource(R.string.students_list),
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = colorResource(R.color.cor_logo),
                    modifier = Modifier
                        .padding(horizontal = 5.dp)
                )
            }
            Card(
                shape = RoundedCornerShape(16.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(90.dp),
                colors = CardDefaults.cardColors(containerColor = Color.Transparent)
            ) {


                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(
                            brush = Brush.horizontalGradient(
                                colors = listOf(
                                    Color(0xFF9FA9E1),
                                    Color(0xFF9FA9E1)
                                )
                            ),
                            shape = RoundedCornerShape(16.dp)
                        )

                ){

                    Card(
                        modifier = Modifier.fillMaxHeight().width(10.dp),
                        colors = CardDefaults.cardColors(containerColor = colorResource(id = R.color.dark_yellow))
                    ) {}

                    Row {  }


                }
            }
        }
    }
}


@Preview(showSystemUi =  true)
@Composable
private fun TelaAlunoPreview(){
    TelaAluno()
}