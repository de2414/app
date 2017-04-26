//
//  ViewController.m
//  玩轉故事版
//
//  Created by 林宥辰 on 2017/3/23.
//  Copyright © 2017年 林宥辰. All rights reserved.
//

#import "ViewController.h"
#import "BViewController.h"

@interface ViewController ()

@end

@implementation ViewController

- (void)viewDidLoad {
    [super viewDidLoad];
}


- (void)prepareForSegue:(UIStoryboardSegue *)segue sender:(id)sender{
    
    NSLog(@"觸發的sender對象是:%@",[sender class]);
    ViewController * destinationViewController =[segue destinationViewController];
    
    [destinationViewController setValue:@"911" forKey:@"number"];
    
//        BViewController *bController=[segue destinationViewController];
//       bController.number=@188;
    
    
}





- (void)didReceiveMemoryWarning {
    [super didReceiveMemoryWarning];
    // Dispose of any resources that can be recreated.
}


@end
