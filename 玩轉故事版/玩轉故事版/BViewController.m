//
//  BViewController.m
//  玩轉故事版
//
//  Created by 林宥辰 on 2017/3/23.
//  Copyright © 2017年 林宥辰. All rights reserved.
//

#import "BViewController.h"

@interface BViewController ()

@property (weak, nonatomic) IBOutlet UIButton *btnOnB;

@end

@implementation BViewController

- (void)viewDidLoad {
    [super viewDidLoad];
    // Do any additional setup after loading the view from its nib.
    
    NSLog(@"%@",_number);
    
    [_btnOnB setTitle:[NSString stringWithFormat:@"收到來自A的值:%@",_number] forState:UIControlStateNormal];

}

- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}

/*
#pragma mark - Navigation

// In a storyboard-based application, you will often want to do a little preparation before navigation
- (void)prepareForSegue:(UIStoryboardSegue *)segue sender:(id)sender {
    // Get the new view controller using [segue destinationViewController].
    // Pass the selected object to the new view controller.
}
*/

@end
