package com.bn.Sample15_8_V1;
import static com.bn.Sample15_8_V1.Constant.SCREEN_HEIGHT;
import static com.bn.Sample15_8_V1.Constant.SCREEN_WIDTH;
import static com.bn.Sample15_8_V1.Constant.SHADOW_TEX_HEIGHT;
import static com.bn.Sample15_8_V1.Constant.SHADOW_TEX_WIDTH;
import android.opengl.GLSurfaceView;
import android.opengl.GLES20;
import android.view.MotionEvent;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import android.content.Context;
 
class MySurfaceView extends GLSurfaceView 
{
	private final float TOUCH_SCALE_FACTOR = 180.0f/320;//�Ƕ����ű���
    private SceneRenderer mRenderer;//������Ⱦ��    
    
    private float mPreviousY;//�ϴεĴ���λ��Y����
    private float mPreviousX;//�ϴεĴ���λ��X����    
    
    //�����λ�����
    float cx=0;
    float cy=1;
    float cz=60;  
    float cAngle=0;
    final float cR=60;
    
    //�ƹ�λ��
	  float lx=0;
	  final float ly=10;
	  float lz=45;   
	  float lAngle=0;
	  final float lR=45;
	  
      final float cDis=15;
    
    //��Դ�ܱ任����
    float[] mMVPMatrixGY;
	
	public MySurfaceView(Context context) {
        super(context);
        this.setEGLContextClientVersion(2); //����ʹ��OPENGL ES2.0
        mRenderer = new SceneRenderer();	//����������Ⱦ��
        setRenderer(mRenderer);				//������Ⱦ��		        
        setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);//������ȾģʽΪ������Ⱦ   
        
        new Thread()
        {
        	public void run()
        	{
        		while(true) 
        		{
        			lAngle += 0.5;//������x����ת�Ƕ�                    
                    lx=(float) Math.sin(Math.toRadians(lAngle))*lR;
                    lz=(float) Math.cos(Math.toRadians(lAngle))*lR;
                    try {
   					Thread.sleep(40);
	   				} catch (InterruptedException e) {
	   					e.printStackTrace();
	   				}
        		}
        	}
        }.start();
    }
	
	//�����¼��ص�����
    @Override 
    public boolean onTouchEvent(MotionEvent e) 
    {
        float y = e.getY();
        float x = e.getX();
        switch (e.getAction()) {
        case MotionEvent.ACTION_MOVE:
            float dy = y - mPreviousY;//���㴥�ر�Yλ��
            float dx = x - mPreviousX;//���㴥�ر�Xλ��
            cAngle += dx * TOUCH_SCALE_FACTOR;//������x����ת�Ƕ�
              
            cx=(float) Math.sin(Math.toRadians(cAngle))*cR;
            cz=(float) Math.cos(Math.toRadians(cAngle))*cR;
            
            cy+= dy/10.0f;//������z���ƶ�
            requestRender();//�ػ滭��
        }
        mPreviousY = y;//��¼���ر�λ��
        mPreviousX = x;//��¼���ر�λ��
        return true;
    }

	private class SceneRenderer implements GLSurfaceView.Renderer 
    {  
    	//��ָ����obj�ļ��м��ض���
		LoadedObjectVertexNormal lovo_pm;//ƽ��
		LoadedObjectVertexNormal lovo_ch;//���
		LoadedObjectVertexNormal lovo_cft;//������
		LoadedObjectVertexNormal lovo_qt;//����
		LoadedObjectVertexNormal lovo_yh;//Բ��
		
		TextureRect tr;		
		int frameBufferId;
		int shadowId;// ��̬��������Ӱ����Id
		int renderDepthBufferId;// ��̬��������Ӱ����Id
		
		
		boolean isBegin=true;
		//��ʼ��֡�������Ⱦ����
		public void initFRBuffers()
		{
			int[] tia=new int[1];
			GLES20.glGenFramebuffers(1, tia, 0);
			frameBufferId=tia[0];
			
			if(isBegin)
			{
				GLES20.glGenRenderbuffers(1, tia, 0);
				renderDepthBufferId=tia[0];
				GLES20.glBindRenderbuffer(GLES20.GL_RENDERBUFFER, renderDepthBufferId);
            	GLES20.glRenderbufferStorage(GLES20.GL_RENDERBUFFER, GLES20.GL_DEPTH_COMPONENT16, SHADOW_TEX_WIDTH, SHADOW_TEX_HEIGHT);
				isBegin=false;
			}
			
			
			int[] tempIds = new int[1];
    		GLES20.glGenTextures
    		(
    				1,          //����������id������
    				tempIds,   //����id������
    				0           //ƫ����
    		);   
    		
    		shadowId=tempIds[0];
    		
		}
		
        //ͨ�����Ʋ�����Ӱ����        
        public void generateShadowImage()
        {
        	initFRBuffers();
        	
        	GLES20.glViewport(0, 0, SHADOW_TEX_WIDTH, SHADOW_TEX_HEIGHT);             	
        	GLES20.glBindFramebuffer(GLES20.GL_FRAMEBUFFER, frameBufferId);            	
        	GLES20.glBindTexture(GLES20.GL_TEXTURE_2D, shadowId);
        	GLES20.glTexParameterf(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_MIN_FILTER,GLES20.GL_LINEAR);
    		GLES20.glTexParameterf(GLES20.GL_TEXTURE_2D,GLES20.GL_TEXTURE_MAG_FILTER,GLES20.GL_LINEAR);
    		GLES20.glTexParameterf(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_WRAP_S,GLES20.GL_CLAMP_TO_EDGE);
    		GLES20.glTexParameterf(GLES20.GL_TEXTURE_2D, GLES20.GL_TEXTURE_WRAP_T,GLES20.GL_CLAMP_TO_EDGE); 
           
            GLES20.glFramebufferTexture2D
            (
            	GLES20.GL_FRAMEBUFFER, 
            	GLES20.GL_COLOR_ATTACHMENT0,
            	GLES20.GL_TEXTURE_2D, 
            	shadowId, 
            	0
            );
            //指定一个二维的纹理图片
        	GLES20.glTexImage2D
        	(
        		GLES20.GL_TEXTURE_2D, 
        		0, 
        		GLES20.GL_RGB, 
        		SHADOW_TEX_WIDTH, 
        		SHADOW_TEX_HEIGHT, 
        		0, 
        		GLES20.GL_RGB, 
        		GLES20.GL_UNSIGNED_SHORT_5_6_5, 
        		null
        	);
        	
        	GLES20.glFramebufferRenderbuffer
        	(
        		GLES20.GL_FRAMEBUFFER, 
        		GLES20.GL_DEPTH_ATTACHMENT,
        		GLES20.GL_RENDERBUFFER, 
        		renderDepthBufferId
        	);

        	
        	//�����Ȼ�������ɫ����
            GLES20.glClear( GLES20.GL_DEPTH_BUFFER_BIT | GLES20.GL_COLOR_BUFFER_BIT);
            
            //���ô˷������������9����λ�þ���
            MatrixState.setCamera(lx,ly,lz,0f,0f,0f,0f,1,0);
            MatrixState.setProjectFrustum(-1, 1, -1.0f, 1.0f, 1.5f, 400);  
            mMVPMatrixGY=MatrixState.getViewProjMatrix();
            
            //�����������ƽ��
            lovo_pm.drawSelfForShadow();  
            
            //��������
            MatrixState.pushMatrix(); 
            MatrixState.translate(-cDis, 0, 0);
            //�����ص����岿λ�����������
            lovo_qt.drawSelfForShadow();
            MatrixState.popMatrix();    
            
            //����Բ��
            MatrixState.pushMatrix();            
            MatrixState.translate(cDis, 0, 0);
            MatrixState.rotate(30, 0, 1, 0);
            //�����ص����岿λ�����������
            lovo_yh.drawSelfForShadow();
            MatrixState.popMatrix();  
            
            //���Ƴ�����
            MatrixState.pushMatrix(); 
            MatrixState.translate(0, 0, -cDis);
            //�����ص����岿λ�����������
            lovo_cft.drawSelfForShadow();
            MatrixState.popMatrix();
            
            //���Ʋ��
            MatrixState.pushMatrix(); 
            MatrixState.translate(0, 0, cDis);
            //�����ص����岿λ�����������
            lovo_ch.drawSelfForShadow();
            MatrixState.popMatrix();     
        }
        
        //������Ӱ����
        public void drawShadowTexture()
        {
        	//�����Ӵ���С��λ�� 
        	GLES20.glViewport(0, 0, (int)SCREEN_WIDTH, (int)SCREEN_HEIGHT); 
        	GLES20.glBindFramebuffer(GLES20.GL_FRAMEBUFFER, 0);
        	//�����Ȼ�������ɫ����
            GLES20.glClear( GLES20.GL_DEPTH_BUFFER_BIT | GLES20.GL_COLOR_BUFFER_BIT);
            GLES20.glClearColor(1f,0.3f,0.3f,1.0f);  
            //���ô˷������������9����λ�þ���
            MatrixState.setCamera(0,0,1.5f,0f,0f,-1f,0f,1.0f,0.0f);
            MatrixState.setProjectOrtho(-0.6f,0.6f, -0.6f, 0.6f, 1, 10);  
            tr.drawSelf(shadowId);   
            GLES20.glDeleteFramebuffers(1, new int[]{frameBufferId}, 0);
            GLES20.glDeleteTextures(1, new int[]{shadowId}, 0);
        }
        
        public void onDrawFrame(GL10 gl)
        {
        	MatrixState.setLightLocation(lx, ly, lz);        	
        	
        	//ͨ�����Ʋ�����Ӱ����
            generateShadowImage();
            //������Ӱ����
            drawShadowTexture();
        }
        public void onSurfaceChanged(GL10 gl, int width, int height) 
        {
            //�����Ӵ���С��λ�� 
        	GLES20.glViewport(0, 0, width, height); 
        	Constant.SCREEN_HEIGHT=height;
        	Constant.SCREEN_WIDTH=width;
        }
       
        public void onSurfaceCreated(GL10 gl, EGLConfig config) {     	
        	//������Ļ����ɫRGBA
            GLES20.glClearColor(0.3f,0.3f,0.3f,1.0f);    
            //����ȼ��
            GLES20.glEnable(GLES20.GL_DEPTH_TEST);
            //�򿪱������   
            GLES20.glEnable(GLES20.GL_CULL_FACE);
            //��ʼ���任����
            MatrixState.setInitStack();
            //��ʼ����Դλ��
            MatrixState.setLightLocation(lx, ly, lz);
            //����Ҫ���Ƶ�����
            lovo_ch=LoadUtil.loadFromFileVertexOnly("ch.obj", MySurfaceView.this.getResources(),MySurfaceView.this);
            lovo_pm=LoadUtil.loadFromFileVertexOnly("pm.obj", MySurfaceView.this.getResources(),MySurfaceView.this);
            lovo_cft=LoadUtil.loadFromFileVertexOnly("cft.obj", MySurfaceView.this.getResources(),MySurfaceView.this);
            lovo_qt=LoadUtil.loadFromFileVertexOnly("qt.obj", MySurfaceView.this.getResources(),MySurfaceView.this);
            lovo_yh=LoadUtil.loadFromFileVertexOnly("yh.obj", MySurfaceView.this.getResources(),MySurfaceView.this);
            //��ʾ��Ӱ��ͼ���������
            tr=new TextureRect(MySurfaceView.this);
        }
    }
	
	

}
