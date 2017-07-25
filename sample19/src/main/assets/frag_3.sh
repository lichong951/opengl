precision mediump float;
//接收从顶点着色器过来的参数
varying vec4 ambient;
varying vec4 diffuse;
varying vec4 specular;
uniform vec4 aColor;
void main()
{
   //将计算出的颜色给此片元
   //vec4 finalColor=vec4(0.9,0.9,0.9,1.0);
   gl_FragColor = aColor*ambient+aColor*specular+aColor*diffuse;//给此片元颜色值
}